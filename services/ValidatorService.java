package pro.sky.hw_2_10.services;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import pro.sky.hw_2_10.Exceptions.EmployeeIncorrectFirstNameException;
import pro.sky.hw_2_10.Exceptions.EmployeeIncorrectLastNameException;

@Service
public class ValidatorService {
    public String validateFirstName(String firstName){
        if(!StringUtils.isAlpha(firstName)){
            throw new EmployeeIncorrectFirstNameException();
        }
        return StringUtils.capitalize(firstName.toLowerCase());
    }
    public String validateLastName(String lastName){
        String[] lastname = lastName.split("-");
        for (int i = 0; i < lastname.length; i++) {
            String s = lastname[i];
            if (!StringUtils.isAlpha(s)) {
                throw new EmployeeIncorrectLastNameException();
            }
            lastname[i] = StringUtils.capitalize(lastName.toLowerCase());
        }
        return String.join("-", lastname);
    }
}
