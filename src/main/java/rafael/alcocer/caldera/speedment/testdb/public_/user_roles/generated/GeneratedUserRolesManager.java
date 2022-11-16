package rafael.alcocer.caldera.speedment.testdb.public_.user_roles.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;
import rafael.alcocer.caldera.speedment.testdb.public_.user_roles.UserRoles;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * rafael.alcocer.caldera.speedment.testdb.public_.user_roles.UserRoles} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedUserRolesManager extends Manager<UserRoles> {
    
    TableIdentifier<UserRoles> IDENTIFIER = TableIdentifier.of("testdb", "public", "user_roles");
    List<Field<UserRoles>> FIELDS = unmodifiableList(asList(
        UserRoles.USER_ID,
        UserRoles.ROLE_ID
    ));
    
    @Override
    default Class<UserRoles> getEntityClass() {
        return UserRoles.class;
    }
}