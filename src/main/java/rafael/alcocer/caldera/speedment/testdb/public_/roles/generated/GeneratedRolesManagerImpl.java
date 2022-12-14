package rafael.alcocer.caldera.speedment.testdb.public_.roles.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;
import rafael.alcocer.caldera.speedment.testdb.public_.roles.Roles;
import rafael.alcocer.caldera.speedment.testdb.public_.roles.RolesImpl;
import rafael.alcocer.caldera.speedment.testdb.public_.roles.RolesManager;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * rafael.alcocer.caldera.speedment.testdb.public_.roles.Roles} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedRolesManagerImpl 
extends AbstractManager<Roles> 
implements GeneratedRolesManager {
    
    private final TableIdentifier<Roles> tableIdentifier;
    
    protected GeneratedRolesManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("testdb", "public", "roles");
    }
    
    @Override
    public Roles create() {
        return new RolesImpl();
    }
    
    @Override
    public TableIdentifier<Roles> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<Roles>> fields() {
        return RolesManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<Roles>> primaryKeyFields() {
        return Stream.of(
            Roles.ID
        );
    }
}