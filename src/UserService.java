public class UserService
{
    private String language;

    // Getter
    public String getLanguage()
    {
        System.out.println("\nPlease select language: ");
        return language;
    }

    // Setter
    public void setLanguage(String newLanguage)
    {
        this.language = newLanguage;
    }
}