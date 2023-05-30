package controllers.task2and3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Controller
public class FormController {

    private static int totalRecords = 0;

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("form");
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public ModelAndView submitForm(@RequestParam("data") String data) {
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("data.txt", true)));
            out.println(data);
            out.close();

            totalRecords++;

            return new ModelAndView("success")
                    .addObject("totalRecords", totalRecords);
        } catch (IOException e) {
            e.printStackTrace();
            return new ModelAndView("error");
        }
    }

    @RequestMapping(value = "/display", method = RequestMethod.GET)
    public String displayData(Model model) {
        try {
            List<String> records = Files.readAllLines(Paths.get("data.txt")); // Читаємо всі записи з файлу
            model.addAttribute("records", records); // Передаємо записи у модель для відображення
            return "display"; // Повертаємо назву HTML-шаблону для відображення записів
        } catch (IOException e) {
            e.printStackTrace();
            return "error"; // Повертаємо назву HTML-шаблону для відображення повідомлення про помилку
        }
    }
}
