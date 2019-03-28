package com.spring.ThymeleafDemo.controller;

import com.spring.ThymeleafDemo.Employee;
import com.spring.ThymeleafDemo.User;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class MyController {

    //Question 1
    @GetMapping("/")
    public String firstPage(){
        return "index";
    }

    // Question 2
    @GetMapping("/hello-world")
    public String helloWorldPage(){
        return "helloWorld";
    }

    //Question 3
    @GetMapping("/employeeForm")
    public String employeeForm(){
        return "employee";
    }

    @PostMapping("/employeeForm")
    public String getEmployeeDetail(HttpServletRequest request, Model model){

        model.addAttribute("name", request.getParameter("name"));
        model.addAttribute("id", request.getParameter("id"));
        model.addAttribute("email", request.getParameter("email"));
        model.addAttribute("competency", request.getParameter("competency"));
        return "employeeDetail";
    }

    //Question 4
    @GetMapping("/employees")
    public String getEmployee(Model model){
        List<Employee> employeeList = Arrays.asList(new Employee("Toshik", 2211, "toshik@gmail.com", 34000),
                new Employee("Abhinav", 3321, "abhinav@gmail.com",25000),
                new Employee("Ajitabh", 1211, "ajitabh@gmail.com", 33000));
        model.addAttribute("employees",employeeList);
        return "employeeTable";
    }

    //Question 5
    @GetMapping("/user")
    public String userForm(){
        return "user";
    }

    @PostMapping("/user")
    public String checkUser(HttpServletRequest request, Model model){
        model.addAttribute("userType",request.getParameter("user"));
        return "userTypePage";
    }

    //Question 7
    @GetMapping("/showTime")
    public String getServerTime(){
        return "showTime";
    }

    @RequestMapping("/getTime")
    @ResponseBody
    public String getTime(){
        LocalTime time = LocalTime.now();
        String formatedTime = time.getHour()+":"+time.getMinute()+":"+time.getSecond();
        return formatedTime;
    }

    //Question 8
    @GetMapping("/userConditional")
    public String userConditionalTag(Model model){
        List<User> userList = Arrays.asList(new User(11,"Adhiraj","Ranchi"), new User(12,"Abhinav","Delhi"),
                new User(13,"Neeraj","Jaipur"), new User(14,"Vivek","Noida"));
        model.addAttribute("users",userList);
        return "userTable";
    }

    //Question 9
    @GetMapping("/enumUser")
    public String getEnumUser(){
        return "enum-userType";
    }

    //Question 10
    @GetMapping("/showLoader")
    public String showLoader(){
        return "registration";
    }
    @PostMapping("/registrationSubmit")
    @ResponseBody
    public String registerEmployee(@ModelAttribute Employee employee)
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Registered: "+employee.getName()+"\n";
    }
}

