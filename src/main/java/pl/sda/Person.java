package pl.sda;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @NotEmpty
    @Size(min = 3, max = 100)
    private String firstName;

    @NotEmpty
    @Size(min = 2, max = 200)
    private String lastName;

    @Min(0)
    private Integer age;

}
