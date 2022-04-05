package dat.startcode.model.entities;

import java.util.Objects;

public class Customer
{
    private String email;
    private String password;
    private String role;

    public Customer(String email, String password, String role)
    {
        this.email = email;
        this.password = password;
        this.role = role;
    }



    @Override
    public String toString()
    {
        return "Customer{" +
                "brugerNavn='" + email + '\'' +
                ", kodeord='" + password + '\'' +
                ", rolle='" + role + '\'' +
                '}';
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getRole()
    {
        return role;
    }

    public void setRole(String role)
    {
        this.role = role;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return getEmail().equals(customer.getEmail()) && getPassword().equals(customer.getPassword()) &&
                getRole().equals(customer.getRole());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getEmail(), getPassword(), getRole());
    }
}
