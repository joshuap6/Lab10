/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {

    /**
     * Name of the Employee.
     */
    private String name;
    /**
     * Name of the manager.
     */
    private String manager;

    /**
     * Constructor for initialization.
     * @param setName name of the Employee
     * @param setManager name of the manager
     */
    public Employee(final String setName, final String setManager) {
        this.name = setName;
        this.manager = setManager;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param newName the new name for the employee
     */
    public void setName(final String newName) {
        this.name = newName;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param newManager new manage for the employee
     */
    public void setManager(final String newManager) {
        this.manager = newManager;
    }
}
