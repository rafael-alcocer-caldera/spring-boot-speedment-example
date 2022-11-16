package rafael.alcocer.caldera.speedment.testdb.public_.users.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;
import rafael.alcocer.caldera.speedment.testdb.public_.users.Users;
import rafael.alcocer.caldera.speedment.testdb.public_.users.UsersImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.common.injector.State.RESOLVED;
import static com.speedment.runtime.core.util.ResultSetUtil.*;

/**
 * The generated Sql Adapter for a {@link
 * rafael.alcocer.caldera.speedment.testdb.public_.users.Users} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedUsersSqlAdapter implements SqlAdapter<Users> {
    
    private final TableIdentifier<Users> tableIdentifier;
    
    protected GeneratedUsersSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("testdb", "public", "users");
    }
    
    protected Users apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setId(       getLong(resultSet, 1 + offset))
            .setEmail(    resultSet.getString(2 + offset))
            .setPassword( resultSet.getString(3 + offset))
            .setUsername( resultSet.getString(4 + offset))
            ;
    }
    
    protected UsersImpl createEntity() {
        return new UsersImpl();
    }
    
    @Override
    public TableIdentifier<Users> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, Users> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, Users> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}