package com.luna.tencent.dto.card;

/**
 * @Package: com.luna.common.dto
 * @ClassName: IdCardOcr
 * @Author: luna
 * @CreateTime: 2020/8/6 12:30
 * @Description:
 */
public class IdCardOcrDTO {

    private String name;

    private String sex;

    private String nation;

    private String birth;

    private String address;

    private String idNum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }
}
