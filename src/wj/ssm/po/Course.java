package wj.ssm.po;

public class Course {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.id
     *
     * @mbggenerated Sun Jul 02 10:29:57 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.course
     *
     * @mbggenerated Sun Jul 02 10:29:57 CST 2017
     */
    private String course;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.id
     *
     * @return the value of course.id
     *
     * @mbggenerated Sun Jul 02 10:29:57 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.id
     *
     * @param id the value for course.id
     *
     * @mbggenerated Sun Jul 02 10:29:57 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.course
     *
     * @return the value of course.course
     *
     * @mbggenerated Sun Jul 02 10:29:57 CST 2017
     */
    public String getCourse() {
        return course;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.course
     *
     * @param course the value for course.course
     *
     * @mbggenerated Sun Jul 02 10:29:57 CST 2017
     */
    public void setCourse(String course) {
        this.course = course == null ? null : course.trim();
    }
}