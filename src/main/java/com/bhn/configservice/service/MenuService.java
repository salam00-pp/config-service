package com.bhn.configservice.service;

import com.bhn.configservice.model.MenuItem;
import com.bhn.configservice.model.View;
import com.bhn.configservice.model.relationalmodel.RoleMenuModel;
import com.bhn.configservice.repository.MenuItemRepository;
import com.bhn.configservice.repository.RoleMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    private MenuItemRepository menuItemRepository;
    @Autowired
    private RoleMenuRepository roleMenuRepository;
    public List<RoleMenuModel> getAllMenuAsPerRole(List<String> roles)
    {

        return roleMenuRepository.findAllByRoleIdIs(roles);
    }
    public List<View> getAllViewAsPerRole()
    {
        return null;
    }
    public MenuItem updateMenuItem(MenuItem menuItem)
    {
        MenuItem updateMenuItem= getMenuItemByMenuItemId(menuItem);
        return menuItemRepository.save(updateMenuItem);
    }

    public MenuItem getMenuItemByMenuItemId(MenuItem menuItem)
    {
        return menuItemRepository.findMenuItemByMenuItemId(menuItem.getMenuItemId()).get();
    }


}
