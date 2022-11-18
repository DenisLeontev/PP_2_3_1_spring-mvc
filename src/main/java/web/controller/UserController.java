package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

@Controller
@RequestMapping("/")
public class UserController {


    @GetMapping
    public String show(Model model) {
        return getUsersView(model);
    }

    @PostMapping
    public String show2(Model model) {
        return getUsersView(model);
    }

    private String getUsersView(Model model) {
        model.addAttribute("message", "Список пользователей");
        model.addAttribute("url", "/users");
        return "index";
    }
// при дабовлении  строки 30 -47  идет ошибка сервера
//    private final UserService userService;
//
//
//    public UserController(UserService userService) {
//        this.userService = userService;
//        addUsers();
//    }
//
//
//    // Создаем список пользователей в базе
//
//    private void addUsers() {
//        userService.create(new User("Денис", "Леонтьев","1@mail.ru"));
//        userService.create(new User("Ян", "Леонтьев","2@mail.ru"));
//        userService.create(new User("Катя", "Леонтьева","3@mail.ru"));
//        userService.create(new User("Maша", "Леонтьева","4@mail.ru"));
//        userService.create(new User("Артем", "Леонтьев","5@mail.ru"));
//    }
    //--- CREATE

//    /***
//     * Подготовить объект User для сохранения в базу
//     */
//    @GetMapping("users/new")
//    public String createForm(@ModelAttribute("user") User user) {
//        return "new";
//    }
//// тут
//    /***
//     * Сохранить в базу
//     */
//    @PostMapping ("users")
//    public String create(@ModelAttribute("user") User user) {
//        // параметры собираются сразу в модель User
//        userService.create(user);
//        return "redirect:users";
//    }
//
//    //--- READ
//
//    /***
//     * Получить всех пользователей
//     */
//    @GetMapping("/users")
//    public String index(Model model) {
//        model.addAttribute("users", userService.getList());
//        return "all";
//    }
//
//    /***
//     * Получить одного пользователя
//     */
//    @GetMapping("users/{id}")
//    public String read(Model model, @PathVariable(name = "id") long id) {
//        model.addAttribute("user", userService.show(id));
//        return "show";
//    }
//
//    //--- UPDATE
//
//    /***
//     * Подготовить изменения для объекта User
//     */
//    @GetMapping("(users/{id}/edit")
//    public String editForm(Model model, @PathVariable() long id) {
//        model.addAttribute("user", userService.show(id));
//        return "edit";
//    }
//
//    /***
//     * Сохранить изменённого пользователя
//     */
//    @PatchMapping("users/{id}")
//    public String edit(@ModelAttribute("user") User user, @PathVariable("id") long id) {
//        userService.update(id, user);
//        return "redirect:/users";
//    }
//
//    //--- DELETE
//
//    /***
//     * Удалить пользователя (подготовки объекта User не требуется)
//     */
//    @DeleteMapping("users/{id}")
//    public String delete(@PathVariable("id") long id) {
//        userService.delete(id);
//        return "redirect:/users";
//    }
}
