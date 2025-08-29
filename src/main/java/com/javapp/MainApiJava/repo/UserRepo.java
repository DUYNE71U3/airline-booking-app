package com.javapp.MainApiJava.repo;

import com.javapp.MainApiJava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);

    @Query("SELECT u FROM User u JOIN u.roles r WHERE r.name = :roleName")
    List<User> findByRoleName(@Param("roleName") String roleName);
    // Tìm tất cả User theo tên Role.
    // Spring Data JPA sẽ tự động phân tích "findByRoleName":
    // - User có quan hệ tới Role (ví dụ: @ManyToOne Role role;).
    // - Role có field "name".
    // => Nó sẽ generate query tương ứng:
    //    SELECT u.* FROM users u
    //    JOIN roles r ON u.role_id = r.id
    //    WHERE r.name = :roleName;
}
