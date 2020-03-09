package app.azure.showcase.system.application;

import app.azure.showcase.system.api.SystemInfoDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class SystemStatusController {

    @GetMapping("/api/v1/system/info")
    public SystemInfoDto getSystemInf() {
        return SystemInfoDto.builder()
                            .currentTimestamp(LocalDateTime.now())
                            .build();
    }
}
