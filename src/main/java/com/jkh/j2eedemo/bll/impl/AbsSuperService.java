package com.jkh.j2eedemo.bll.impl;

import com.jkh.j2eedemo.bll.inter.AbsSuperServiceInter;
import com.jkh.j2eedemo.entity.AbsSuperObject;
import com.jkh.j2eedemo.entity.Jsons;
import com.jkh.j2eedemo.entity.KesunReturn;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DuplicateKeyException;

import java.util.List;
import java.util.Map;


public abstract class AbsSuperService implements AbsSuperServiceInter {
    private AbsSuperObject model;

    @Override
    public AbsSuperObject getModel() {
        return model;
    }

    @Override
    public void setModel(AbsSuperObject model) {
        this.model = model;
    }

    //检查DAO是否为空
    private KesunReturn checkDAO() {
        KesunReturn back = new KesunReturn();
        if (getDao() == null) {
            back.setCode("0000");
            back.setMessage("查询过程中数据访问层出错！");
            back.setObj(false);
        } else {
            back.setCode("0000");
            back.setMessage("查询过程中数据访问层出错！");
            back.setObj(true);
        }
        return back;
    }

    /**
     * description:
     * <p>
     * author:jkh
     */
    @Override
    public KesunReturn findById() {
        KesunReturn back = new KesunReturn();
        if (model == null || model.getId() == null
                || "".equals(model.getId().trim())) {
            back.setCode("0000");
            back.setMessage("系统没有获取到所查询所需要的ID，请稍后尝试！");
            back.setObj(null);
        }
        back = checkDAO();
        if ((Boolean) back.getObj() == false) return back;

        AbsSuperObject obj = getDao().findById(model.getId());
        if (obj == null) {
            back.setCode("0002");
            back.setMessage("未查询到结果！");
            back.setObj(null);
        } else {
            back.setCode("1000");
            back.setMessage("查询成功");
            back.setObj(obj);
        }
        return back;

    }

    /**
     * description:添加学生
     * date: 2022/4/1 22:04
     * author:jkh
     */
    @Override
    public KesunReturn add() {
        KesunReturn back = new KesunReturn();

        if (model == null) {
            back.setCode("0000");
            back.setMessage("未录入学生信息！");
            back.setObj(0);
        }
        back = checkDAO();
        if ((Boolean) back.getObj() == false) return back;
        int addNum = getDao().add(model);
        if (addNum > 0) {
            back.setCode("200");
            back.setMessage("添加数据成功！");
            back.setObj(1);
        } else {
            back.setCode("0000");
            back.setMessage("添加数据失败！");
            back.setObj(0);
        }
        return back;
    }

    /**
     * description:
     * <p>
     * author:jkh
     */
    @Override
    public KesunReturn edit() {
        KesunReturn back = new KesunReturn();

        if (model == null) {
            back.setCode("0000");
            back.setMessage("未提供修改条件!");
            back.setObj(null);
        }
        back = checkDAO();
        if ((Boolean) back.getObj() == false) return back;
        int editNum = getDao().edit(model);
        if (editNum > 0) {
            back.setCode("200");
            back.setMessage("数据修改成功！");
            back.setObj(null);
        } else {
            back.setCode("404");
            back.setMessage("数据修改失败！");
            back.setObj(null);
        }
        return back;
    }

    /**
     * description:根据条件
     * <p>
     * author:jkh
     */
    @Override
    public KesunReturn batchEdit(Map<String, Object> cons) {
        KesunReturn back = new KesunReturn();

        if (cons.size() == 0) {
            back.setCode("0000");
            back.setMessage("未提供修改条件!");
            back.setObj(null);
        }
        back = checkDAO();
        if ((Boolean) back.getObj() == false) return back;
        int beditNum = getDao().batchEdit(cons);
        if (beditNum > 0) {
            back.setCode("6666");
            back.setMessage(beditNum + "条数据修改成功！");
            back.setObj(null);
        } else {
            back.setCode("0000");
            back.setMessage("修改数据失败！");
            back.setObj(null);
        }
        return back;
    }

    @Override
    public KesunReturn batchDel(Map<String, Object> cons) {
        KesunReturn back = new KesunReturn();
        if (cons.size() == 0 && cons.get("ids") == null) {
            back.setCode("0000");
            back.setMessage("未提供批量删除的条件!");
            back.setObj(null);
            return back;
        }
        back = checkDAO();
        if ((Boolean) back.getObj() == false) return back;
        int batchNum = getDao().batchDel(cons);
        if (batchNum > 0) {
            back.setMessage(batchNum + "条数据已经删除成功!");
            back.setCode(String.valueOf(batchNum));
            back.setObj(String.valueOf(batchNum));
        } else {
            back.setCode("0000");
            back.setMessage("删除失败!");
        }
        return back;
    }

    /**
     * description:按照多个条件查询
     * date:
     * author:jkh
     */
    @Override
    public KesunReturn finds(Map<String, Object> cons) {
        KesunReturn back = new KesunReturn();
        if (cons.size() == 0 || cons == null) {
            back.setCode("0000");
            back.setMessage("您没有提供查找的条件！");
            back.setObj(null);
        }

        back = checkDAO();
        if ((Boolean) back.getObj() == false) return back;
        List<Map<String, Object>> stus = getDao().find(cons);
        if (stus.size() > 0) {
            back.setCode("6666");
            back.setMessage("数据查询成功！共查询到[" + stus.size() + "]条数据");
            back.setObj(stus);
        } else {
            back.setCode("0000");
            back.setMessage("没有查询到符合您要求的数据！");
            back.setObj(null);
        }
        return back;
    }

    /**
     * description:删除
     * date: 2022/4/1 22:40
     * author:jkh
     */
    @Override
    public KesunReturn delete() {
        KesunReturn back = new KesunReturn();
        if (model == null) {
            back.setCode("0000");
            back.setMessage("数据异常");
            back.setObj(null);
            return back;
        }
        if (model == null || model.getId() == null) {
            back.setCode("0000");
            back.setMessage("数据未设置");
            back.setObj(null);
            return back;
        }
        back = checkDAO();
        if ((Boolean) back.getObj() == false) return back;
        int del = getDao().del(model);
        if (del > 0) {
            back.setCode("200");
            back.setMessage("【" + del + "】" + "条数据删除成功！");
            back.setObj(null);
        } else {
            back.setCode("0000");
            back.setMessage("删除失败");
            back.setObj(null);
        }
        return back;
    }

    /**
     * description:批量新增
     * date: 2022/4/1 20:05
     * author:jkh
     */
    @Override
    public KesunReturn batchSave(List<AbsSuperObject> objs) {
        KesunReturn back = new KesunReturn();

        try {
            if (objs == null | objs.size() == 0) {
                back.setCode("0000");
                back.setMessage("您未新增数据!");
                return back;
            }
            back = checkDAO();
            if ((Boolean) back.getObj() == false) return back;
            int batchSaveNum = getDao().batchSave(objs);
            if (batchSaveNum > 0) {
                back.setMessage("已经完成【" + batchSaveNum + "】条数据新增!");
            } else {
                back.setCode("0000");
                back.setMessage("学生数据批量新增失败!");
            }
            back.setObj(batchSaveNum);
            return back;
        } catch (DuplicateKeyException ex) {
            back.setCode("5002");
            back.setMessage("数据重复,当前已经存在!");
            return back;
        } catch (DataIntegrityViolationException ex1) {
            back.setCode("5003");
            back.setMessage("您提供的数据关联不准确!");
            return back;
        }
    }

    /**
     * description:批量修改
     * date: 2022/4/1 22:07
     * author:jkh
     */
    @Override
    public KesunReturn batchUpdate(List<AbsSuperObject> objs) {
        KesunReturn back = new KesunReturn();
        if (objs == null || objs.size() == 0) {
            back.setCode("0000");
            back.setMessage("未提供修改条件!");
        }
        back = checkDAO();
        if ((Boolean) back.getObj() == false) {
            return back;
        }
        int res = getDao().batchUpdat(objs);
        if (res > 0) {
            back.setMessage("数据已经修改成功!");
            back.setCode("6666");
        } else {
            back.setCode("0000");
            back.setMessage("修改失败!");
        }
        return back;
    }

    /**
     * description:获取行数
     * date: 2022/4/5 15:01
     * author:jkh
     */
    @Override
    public KesunReturn getRowscount(Map<String, Object> cons) {
        KesunReturn back = new KesunReturn();
        if (cons.size() == 0 || cons == null) {
            back.setCode("0000");
            back.setMessage("您没有提供查找的条件！");
            back.setObj(null);
            return back;
        }

        back = checkDAO();
        if ((Boolean) back.getObj() == false) return back;
        int length = getDao().getRowsCount(cons);
        if (length > 0) {
            back.setCode("6666");
            back.setMessage("数据查询成功！共查询到【" + length + "】条数据");
            back.setObj(length);
        } else {
            back.setCode("0000");
            back.setMessage("没有查询到符合您要求的数据！");
            back.setObj(null);
        }
        return back;
    }

    /**
     * description:分页查找
     * date: 2022/4/5 15:01
     * author:jkh
     */
    @Override
    public KesunReturn findByPage(Map<String, Object> cons, int startPage, int rowsCount) {
        KesunReturn back = new KesunReturn();
        if (cons.size() == 0 || cons == null) {
            back.setCode("0000");
            back.setMessage("您没有提供查找的条件！");
            back.setObj(null);
            return back;
        }
        if (startPage <= 0) {
            back.setCode("0000");
            back.setMessage("您没有提供正确的起始页码！");
            back.setObj(null);
            return back;
        }
        if (rowsCount <= 0) {
            back.setCode("0000");
            back.setMessage("您没有提供正确的每页显示行数！");
            back.setObj(null);
            return back;
        }

        back = checkDAO();
        if ((Boolean) back.getObj() == false) return back;
        cons.put("rowscount", rowsCount);
        cons.put("startpage", (startPage - 1) * rowsCount);
        List<AbsSuperObject> res = getDao().findByPage(cons);
        if (res.size() > 0) {
            int length = getDao().getRowsCount(cons);
            if (length > 0) {
                back.setCode(String.valueOf(length));
                back.setMessage("数据查询成功！共查询到【" + length + "】条数据");
                back.setObj(res);
            }
        } else {
            back.setCode("0000");
            back.setMessage("没有查询到符合您要求的数据！");
            back.setObj(null);
        }
        return back;
    }

    public KesunReturn findall() {

        KesunReturn back = new KesunReturn();
        back = checkDAO();
        if ((Boolean) back.getObj() == false) return back;
        List findall = getDao().findall();
        if (findall.size() == 0) {
            back.setCode("404");
            back.setMessage("查询失败!");
            return back;
        } else {
            back.setCode("200");
            back.setMessage("查询成功!共有" + findall.size() + "条数据!");
            back.setObj(findall);
        }
        return back;
    }

    //    ctrl alt l格式化代码
    public KesunReturn findbyjsonname(String name) {
        if (name == null) {
            return new KesunReturn("404", "提供查询的条件为空");
        }
        KesunReturn back = checkDAO();
        if (false == (Boolean) back.getObj()) {
            return new KesunReturn("404", "数据访问层出错");
        }
        Jsons jsons = (Jsons) getDao().findbyname(name);
        if (jsons == null) {
            return new KesunReturn("404", "没有查询到相关数据!");
        }
        return  new KesunReturn("200","jsons查询成功!",jsons);
    }
}

