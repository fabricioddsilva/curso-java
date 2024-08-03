package entities;

import java.time.Instant;
import java.util.Objects;

public class AcessLog {
    private String username;
    private Instant acessInstant;

    public AcessLog(String username, Instant acessInstant) {
        this.username = username;
        this.acessInstant = acessInstant;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Instant getAcessInstant() {
        return acessInstant;
    }

    public void setAcessInstant(Instant acessInstant) {
        this.acessInstant = acessInstant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AcessLog acessLog = (AcessLog) o;
        return Objects.equals(getUsername(), acessLog.getUsername());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getUsername());
    }

}
