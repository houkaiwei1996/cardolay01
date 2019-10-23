package com.zzb.ipfs.filestore.pojo;

public class MongoPojo {
    /**姓名*/
    private String name;

    @Override
    public String toString() {
        return "MongoPojo{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", ahe=" + ahe +
                '}';
    }

    /**性别*/
    private String sex;

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

    public Integer getAhe() {
        return ahe;
    }

    public void setAhe(Integer ahe) {
        this.ahe = ahe;
    }

    /**年龄*/
    private Integer ahe;
}
