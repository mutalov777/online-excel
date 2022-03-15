package uz.excel.onlineexcel.dto.auth;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginDto {

    private String userName;

    private String password;
}
