package vn.com.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.security.entity.RoleEntity;
import vn.com.security.entity.RoleName;

import java.util.Optional;

/**
 * @author NhanVT3
 */
public interface RoleRepository extends JpaRepository<RoleEntity,Long> {
    Optional<RoleEntity> findByName(RoleName roleName);
}
