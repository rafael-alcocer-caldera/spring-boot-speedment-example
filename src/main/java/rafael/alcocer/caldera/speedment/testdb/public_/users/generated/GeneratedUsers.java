package rafael.alcocer.caldera.speedment.testdb.public_.users.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.LongField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;
import rafael.alcocer.caldera.speedment.testdb.public_.users.Users;

import java.util.Optional;

/**
 * The generated base for the {@link
 * rafael.alcocer.caldera.speedment.testdb.public_.users.Users}-interface
 * representing entities of the {@code users}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedUsers {
    
    /**
     * This Field corresponds to the {@link Users} field that can be obtained
     * using the {@link Users#getId()} method.
     */
    LongField<Users, Long> ID = LongField.create(
        Identifier.ID,
        Users::getId,
        Users::setId,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link Users} field that can be obtained
     * using the {@link Users#getEmail()} method.
     */
    StringField<Users, String> EMAIL = StringField.create(
        Identifier.EMAIL,
        o -> OptionalUtil.unwrap(o.getEmail()),
        Users::setEmail,
        TypeMapper.identity(),
        true
    );
    /**
     * This Field corresponds to the {@link Users} field that can be obtained
     * using the {@link Users#getPassword()} method.
     */
    StringField<Users, String> PASSWORD = StringField.create(
        Identifier.PASSWORD,
        o -> OptionalUtil.unwrap(o.getPassword()),
        Users::setPassword,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Users} field that can be obtained
     * using the {@link Users#getUsername()} method.
     */
    StringField<Users, String> USERNAME = StringField.create(
        Identifier.USERNAME,
        o -> OptionalUtil.unwrap(o.getUsername()),
        Users::setUsername,
        TypeMapper.identity(),
        true
    );
    
    /**
     * Returns the id of this Users. The id field corresponds to the database
     * column testdb.public.users.id.
     * 
     * @return the id of this Users
     */
    long getId();
    
    /**
     * Returns the email of this Users. The email field corresponds to the
     * database column testdb.public.users.email.
     * 
     * @return the email of this Users
     */
    Optional<String> getEmail();
    
    /**
     * Returns the password of this Users. The password field corresponds to the
     * database column testdb.public.users.password.
     * 
     * @return the password of this Users
     */
    Optional<String> getPassword();
    
    /**
     * Returns the username of this Users. The username field corresponds to the
     * database column testdb.public.users.username.
     * 
     * @return the username of this Users
     */
    Optional<String> getUsername();
    
    /**
     * Sets the id of this Users. The id field corresponds to the database
     * column testdb.public.users.id.
     * 
     * @param id to set of this Users
     * @return   this Users instance
     */
    Users setId(long id);
    
    /**
     * Sets the email of this Users. The email field corresponds to the database
     * column testdb.public.users.email.
     * 
     * @param email to set of this Users
     * @return      this Users instance
     */
    Users setEmail(String email);
    
    /**
     * Sets the password of this Users. The password field corresponds to the
     * database column testdb.public.users.password.
     * 
     * @param password to set of this Users
     * @return         this Users instance
     */
    Users setPassword(String password);
    
    /**
     * Sets the username of this Users. The username field corresponds to the
     * database column testdb.public.users.username.
     * 
     * @param username to set of this Users
     * @return         this Users instance
     */
    Users setUsername(String username);
    
    enum Identifier implements ColumnIdentifier<Users> {
        
        ID       ("id"),
        EMAIL    ("email"),
        PASSWORD ("password"),
        USERNAME ("username");
        
        private final String columnId;
        private final TableIdentifier<Users> tableIdentifier;
        
        Identifier(String columnId) {
            this.columnId        = columnId;
            this.tableIdentifier = TableIdentifier.of(    getDbmsId(), 
                getSchemaId(), 
                getTableId());
        }
        
        @Override
        public String getDbmsId() {
            return "testdb";
        }
        
        @Override
        public String getSchemaId() {
            return "public";
        }
        
        @Override
        public String getTableId() {
            return "users";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<Users> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}