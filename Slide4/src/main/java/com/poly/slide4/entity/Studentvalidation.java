package com.poly.slide4.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Studentvalidation {
    @NotBlank(message = "Chưa nhập email")
    @Email(message = "Không đúng định dạng email")
    private String id;
    @NotBlank(message = "Chưa nhập họ tên")
    private String fullname;
    @NotNull(message = "Chưa chọn giới tính")
    private Boolean gender;
    @NotNull(message = "Chưa nhập ngày sinh")
    @Builder.Default
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday = new Date();
    @NotNull(message = "Chưa nhập hình ảnh")
    @Builder.Default
    String photo = "photo.png";
    @NotNull(message = "Chưa nhập điểm")
    @Range(min = 0, max = 10, message = "Điểm phải từ 0 đến 10")
    private Double mark;
}
//public class Student {
//    private String id;
//    private String fullname;
//    private Boolean gender;
//    @Builder.Default
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    private Date birthday = new Date();
//    @Builder.Default
//    String photo = "photo.png";
//    private Double mark;
//}
