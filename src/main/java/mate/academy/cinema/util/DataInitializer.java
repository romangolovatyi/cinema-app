package mate.academy.cinema.util;

import java.util.Set;
import javax.annotation.PostConstruct;
import mate.academy.cinema.model.Role;
import mate.academy.cinema.model.Role.RoleName;
import mate.academy.cinema.model.User;
import mate.academy.cinema.service.RoleService;
import mate.academy.cinema.service.ShoppingCartService;
import mate.academy.cinema.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final ShoppingCartService shoppingCartService;
    private final UserService userService;

    public DataInitializer(RoleService roleService,
                           ShoppingCartService shoppingCartService,
                           UserService userService) {
        this.roleService = roleService;
        this.shoppingCartService = shoppingCartService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(RoleName.ADMIN);
        roleService.add(adminRole);

        Role userRole = new Role();
        userRole.setRoleName(RoleName.USER);
        roleService.add(userRole);

        User testAdmin = new User();
        testAdmin.setEmail("admin@gmail.com");
        testAdmin.setPassword("12345678");
        testAdmin.setRoles(Set.of(adminRole));
        userService.add(testAdmin);

        User testUser = new User();
        testUser.setEmail("user@gmail.com");
        testUser.setPassword("12345678");
        testUser.setRoles(Set.of(userRole));
        userService.add(testUser);
        shoppingCartService.registerNewShoppingCart(testUser);
    }
}
