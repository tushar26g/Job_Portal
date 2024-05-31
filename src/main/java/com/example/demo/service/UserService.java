package com.example.demo.service;
import com.example.demo.entity.User;
import com.example.demo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return user;
    }

    public void save(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setEnabled(true);  // Set default enabled status
        user.setRole("ROLE_USER");  // Set default role
        user.setAcCoinBalance(25);  // Set default AC Coin balance for new users
        userRepository.save(user);
    }

    public void updateAcCoinBalance(String username) {
        User user = userRepository.findByUsername(username);
        if (user != null) {
            LocalDate lastLoginDate = user.getLastLoginDate();
            LocalDate currentDate = LocalDate.now();

            if (lastLoginDate == null || !lastLoginDate.isEqual(currentDate)) {
                user.setAcCoinBalance(user.getAcCoinBalance() + 2);
                user.setLastLoginDate(currentDate);
                userRepository.save(user);
            }
        }
    }
}

