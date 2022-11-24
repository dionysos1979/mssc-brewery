package guru.springframework.msscbrewery.web.model;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {
    private String customerName;
    private UUID id;

}
