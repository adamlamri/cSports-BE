package sportstracker.common.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * Bind all the file storage properties
 *
 */
@ConfigurationProperties(prefix = "upload")
@Getter
@Setter
public class FileStorageProperties {
    private String activityImageDir;
    private List<String> extensions;
    private String profileImageDir;
}
