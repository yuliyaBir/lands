package be.vdab.landen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("landen")
class LandController {
    private final LandService landService;

    public LandController(LandService landService) {
        this.landService = landService;
    }
    @GetMapping("number")
    long findNumber() {
        return landService.findNumber();
    }
}
