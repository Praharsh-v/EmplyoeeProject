package Model;

public class ProjectsEmployee {
   private String ProjectName;
   private String startDate;
   private String endDate;

    public ProjectsEmployee() {
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public ProjectsEmployee(String projectName, String startDate, String endDate) {
        ProjectName = projectName;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
