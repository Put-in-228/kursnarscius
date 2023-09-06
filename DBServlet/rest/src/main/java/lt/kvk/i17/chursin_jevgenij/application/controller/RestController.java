package lt.kvk.i17.chursin_jevgenij.application.controller;

import lt.kvk.i17.chursin_jevgenij.application.domain.Vartotojas;
import lt.kvk.i17.chursin_jevgenij.application.models.ForgotModel;
import lt.kvk.i17.chursin_jevgenij.application.models.LoginModel;
import lt.kvk.i17.chursin_jevgenij.application.models.NewModel;
import lt.kvk.i17.chursin_jevgenij.application.models.RegisterModel;
import lt.kvk.i17.chursin_jevgenij.application.repository.VartotojasRepository;
import lt.kvk.i17.chursin_jevgenij.application.service.VartotojasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
@ComponentScan(basePackages = "lt.kvk.i17.chursin_jevgenij.application.service")
public class RestController {

    private final VartotojasService vartotojasService;
    private final TransportoPriemoneService tpService;
    private final IsdavimoSutartisService isService;

    @Autowired
    public RestController(VartotojasService vartotojasService) {
        this.vartotojasService = vartotojasService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginModel loginModel) {
        Vartotojas vartotojas = vartotojasService.findByUsername(loginModel.getUsername());
        System.out.println(vartotojas.getLogin()+"  "+loginModel.getUsername()+"  pass "+vartotojas.getPassword()+"  "+loginModel.getPassword());
        if(vartotojas.getPassword().equals(loginModel.getPassword())) {
            return ResponseEntity.ok(String.valueOf(vartotojas.getId()));
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterModel registerModel) {
        System.out.println(registerModel.getTelephone());
        System.out.println("Before moving on to starting the saving");
        Vartotojas vartotojas = vartotojasService.saveToDatabase(registerModel);
        System.out.println("Ending the function");
        return ResponseEntity.ok(String.valueOf(vartotojas.getId()));
    }

    @PostMapping("/forgot")
    public ResponseEntity<String> forgot(@RequestBody ForgotModel forgotModel) {
        System.out.println(forgotModel.getEmail());
        return ResponseEntity.ok("Data delivered");
    }

    @PostMapping("/new")
    public ResponseEntity<String> newCar(@RequestBody NewModel newModel) {
        System.out.println(newModel.getCarModel());

        return ResponseEntity.ok("Data delivered");
    }
}
