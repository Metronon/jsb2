package com.mysite.sbb.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateForm {
    @Size(min=3, max=25)
    @NotEmpty(message = "아이디는 빈칸일 수 없습니다.")
    private String username;

    @NotEmpty(message = "비밀번호는 빈칸일 수 없습니다.")
    private String password1;

    @NotEmpty(message = "비밀번호 확인란은 빈칸일 수 없습니다.")
    private String password2;

    @Email
    @NotEmpty(message = "이메일은 빈칸일 수 없습니다.")
    private String email;
}
