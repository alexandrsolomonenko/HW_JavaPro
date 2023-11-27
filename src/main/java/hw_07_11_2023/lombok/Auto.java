package hw_07_11_2023.lombok;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@Getter
@Setter
@NoArgsConstructor

public class Auto {
    private String model;
    private int yearModel;
    private String lineVersion;
}
