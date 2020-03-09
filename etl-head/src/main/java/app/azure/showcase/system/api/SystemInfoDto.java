package app.azure.showcase.system.api;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class SystemInfoDto {
    private final LocalDateTime currentTimestamp;
}
