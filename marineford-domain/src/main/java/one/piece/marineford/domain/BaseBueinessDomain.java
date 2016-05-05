package one.piece.marineford.domain;

import one.piece.marineford.annotation.dao.springjdbc.Column;
import one.piece.marineford.data.BaseDataObject;

import java.util.Date;

/**
 * Created by Administrator on 2016/5/4.
 */
public abstract class BaseBueinessDomain extends BaseDataObject {

    private Date createTime;
    private int createBy;
    private Date updateTime;
    private int updateBy;

    @Column(name = "create_time")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Column(name = "create_by")
    public int getCreateBy() {
        return createBy;
    }

    public void setCreateBy(int createBy) {
        this.createBy = createBy;
    }

    @Column(name = "update_time")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Column(name = "update_by")
    public int getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(int updateBy) {
        this.updateBy = updateBy;
    }

}
