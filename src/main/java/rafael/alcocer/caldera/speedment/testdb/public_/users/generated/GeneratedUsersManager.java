package rafael.alcocer.caldera.speedment.testdb.public_.users.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;
import rafael.alcocer.caldera.speedment.testdb.public_.users.Users;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * rafael.alcocer.caldera.speedment.testdb.public_.users.Users} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedUsersManager extends Manager<Users> {
    
    TableIdentifier<Users> IDENTIFIER = TableIdentifier.of("testdb", "public", "users");
    List<Field<Users>> FIELDS = unmodifiableList(asList(
        Users.ID,
        Users.EMAIL,
        Users.PASSWORD,
        Users.USERNAME
    ));
    
    @Override
    default Class<Users> getEntityClass() {
        return Users.class;
    }
}