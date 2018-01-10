package main.java.com.mygroup.model.vo;

/**
 * Created by Administrator on 2018/1/10.
 */
public class FirstVo {
    private String name;

    private Integer age;

    private Boolean manFlag;

    public FirstVo() {
    }

    public FirstVo(String name, Boolean manFlag) {

        this.name = name;
        this.manFlag = manFlag;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getManFlag() {
        return manFlag;
    }

    public void setManFlag(Boolean manFlag) {
        this.manFlag = manFlag;
    }
}
