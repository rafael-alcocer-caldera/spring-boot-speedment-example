package rafael.alcocer.caldera.speedment.testdb.public_.roles.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;
import rafael.alcocer.caldera.speedment.testdb.public_.roles.Roles;
import rafael.alcocer.caldera.speedment.testdb.public_.roles.RolesImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.common.injector.State.RESOLVED;
import static com.speedment.runtime.core.util.ResultSetUtil.*;

/**
 * The generated Sql Adapter for a {@link
 * rafael.alcocer.caldera.speedment.testdb.public_.roles.Roles} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedRolesSqlAdapter implements SqlAdapter<Roles> {
    
    private final TableIdentifier<Roles> tableIdentifier;
    
    protected GeneratedRolesSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("testdb", "public", "roles");
    }
    
    protected Roles apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setId(   getInt(resultSet, 1 + offset))
            .setName( resultSet.getString(2 + offset))
            ;
    }
    
    protected RolesImpl createEntity() {
        return new RolesImpl();
    }
    
    @Override
    public TableIdentifier<Roles> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, Roles> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, Roles> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}