package app.azure.showcase.system.api;

import lombok.Builder;
import lombok.Data;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@Data
@Builder
public class SystemInfoDto {
    private final ZonedDateTime currentTimestamp;
    private final ZoneId zoneId;

}
