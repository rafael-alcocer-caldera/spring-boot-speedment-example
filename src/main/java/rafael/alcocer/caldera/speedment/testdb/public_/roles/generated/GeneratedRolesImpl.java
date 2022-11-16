package rafael.alcocer.caldera.speedment.testdb.public_.roles.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.util.OptionalUtil;
import rafael.alcocer.caldera.speedment.testdb.public_.roles.Roles;

import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * rafael.alcocer.caldera.speedment.testdb.public_.roles.Roles}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedRolesImpl implements Roles {
    
    private int id;
    private String name;
    
    protected GeneratedRolesImpl() {}
    
    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }
    
    @Override
    public Roles setId(int id) {
        this.id = id;
        return this;
    }
    
    @Override
    public Roles setName(String name) {
        this.name = name;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "   + Objects.toString(getId()));
        sj.add("name = " + Objects.toString(OptionalUtil.unwrap(getName())));
        return "RolesImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Roles)) { return false; }
        final Roles thatRoles = (Roles)that;
        if (this.getId() != thatRoles.getId()) { return false; }
        if (!Objects.equals(this.getName(), thatRoles.getName())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getName()));
        return hash;
    }
}