package com.kuaixun.model;

import java.io.Serializable;
import java.util.List;

/**
 * 〈分页bean〉
 *
 * @author yangkai
 * @create 2018/2/28
 * @since 1.0.0
 */
public class PageBean<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    //当前页
    private int pageNum;
    //每页的数量
    private int pageSize;
    //总记录数
    private Integer total;
    //总页数
    private int pages;
    //结果集
    private List<T> list;
    //开始索引
    private Integer startIndex;
    //是否有下一页
    private Integer isMore;


    public PageBean() {

    }

    /**
     * 包装Page对象
     */
    public PageBean(Integer pageNum, Integer pageSize, Integer total) {
        super();
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.total = total;
        this.pages = (this.total + this.pageSize - 1) / this.pageSize;
        this.startIndex = (this.pageNum - 1) * this.pageSize;
        this.isMore = this.pageNum >= this.total ? 0 : 1;

    }

    /**
     * 判定页面边界
     */

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Integer getIsMore() {
        return isMore;
    }

    public void setIsMore(Integer isLastPage) {
        this.isMore = isMore;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }


}