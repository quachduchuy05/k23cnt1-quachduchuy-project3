package k23cnt1.qdh.leson4.k23cnt1.qdh.leson4.controller;

import k23cnt1.qdh.leson4.k23cnt1.qdh.leson4.entity.info;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping
public class qdhhomecontroller {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("title", "Devmaster::Trang chủ");
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("message", "Giới thiệu về Spring Core / SpringBoot");
        return "about";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        String info = """
                Giới thiệu về Spring Core / SpringBoot
                IT Research Department @Devmaster 2024
                https://devmaster.edu.vn
                Học Cùng Doanh Nghiệp
                Learn To Work – Học Để Làm Được Việc
                Hotline: 0978.611.889
                """;
        model.addAttribute("info", info);
        return "contact";
    }

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/profile")
    public String profile(Model model) {
        List<info> profile = new ArrayList<>();
        // Tạo thông tin profile
        profile.add(new info(
                "Devmaster Academy",
                "dev",
                "contact@devmaster.edu.vn",
                "https://devmaster.edu.vn"
        ));

        // Đưa profile vào model
        model.addAttribute("DevmasterProfile", profile);
        return "profile";
    }
}
