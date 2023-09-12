package com.coder.securespringapp.init;

import com.coder.securespringapp.model.Role;
import com.coder.securespringapp.model.RoleType;
import com.coder.securespringapp.model.User;
import com.coder.securespringapp.repository.RoleRepository;
import com.coder.securespringapp.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@AllArgsConstructor
public class DataInitializer implements CommandLineRunner {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void run(String... args) throws Exception {
        Role adminRole = new Role(RoleType.ADMIN);
        Role userRole = new Role(RoleType.USER);
        roleRepository.save(adminRole);
        roleRepository.save(userRole);
        User user = new User("coder", bCryptPasswordEncoder.encode("temp/12345"),
                "test_123@gmail.com", Set.of(adminRole, userRole));
        userRepository.save(user);

    }
}
