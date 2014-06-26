package lab.s2jh.biz.finance.web.action;

import lab.s2jh.biz.finance.entity.BizTradeUnit;
import lab.s2jh.biz.finance.service.BizTradeUnitService;
import lab.s2jh.core.annotation.MetaData;
import lab.s2jh.core.service.BaseService;
import lab.s2jh.core.web.view.OperationResult;
import lab.s2jh.web.action.BaseController;

import org.apache.struts2.rest.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;

@MetaData("业务往来单位管理")
public class BizTradeUnitController extends BaseController<BizTradeUnit,Long> {

    @Autowired
    private BizTradeUnitService bizTradeUnitService;

    @Override
    protected BaseService<BizTradeUnit, Long> getEntityService() {
        return bizTradeUnitService;
    }
    
    @Override
    protected void checkEntityAclPermission(BizTradeUnit entity) {
        // TODO Add acl check code logic
    }

    @MetaData("[TODO方法作用]")
    public HttpHeaders todo() {
        //TODO
        setModel(OperationResult.buildSuccessResult("TODO操作完成"));
        return buildDefaultHttpHeaders();
    }
    
    @Override
    @MetaData("创建")
    public HttpHeaders doCreate() {
        return super.doCreate();
    }

    @Override
    @MetaData("更新")
    public HttpHeaders doUpdate() {
        return super.doUpdate();
    }
    
    @Override
    @MetaData("保存")
    public HttpHeaders doSave() {
        return super.doSave();
    }

    @Override
    @MetaData("删除")
    public HttpHeaders doDelete() {
        return super.doDelete();
    }

    @Override
    @MetaData("查询")
    public HttpHeaders findByPage() {
        return super.findByPage();
    }
}