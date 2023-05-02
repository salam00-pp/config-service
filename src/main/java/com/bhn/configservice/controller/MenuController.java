package com.bhn.configservice.controller;

import com.bhn.configservice.model.relationalmodel.RoleMenuModel;
import com.bhn.configservice.repository.RoleMenuRepository;
import com.bhn.configservice.service.MenuService;
import com.bhn.configservice.model.MenuItem;
import com.bhn.configservice.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    MenuItemRepository menuItemRepository;

    @Autowired
    RoleMenuRepository roleMenuRepository;
    @Autowired
    MenuService menuService;
    @GetMapping("/global-menu")
    public RoleMenuModel getGlobalMenu(@RequestParam String roleId)
    {


        return roleMenuRepository.findRoleMenuModelByRoleId(roleId).get();
    }

    @PostMapping
    public MenuItem saveMenuItem(@RequestBody MenuItem menuItem)
    {
        return menuItemRepository.save(menuItem);
    }
    @GetMapping("/all-menu")
    public List<MenuItem> getAllMenuItem()
    {
        return menuItemRepository.findAll();
    }
    @PutMapping
    public MenuItem updateMenuItem(@RequestBody MenuItem menuItem)
    {
        return menuService.updateMenuItem(menuItem);
    }

    @PostMapping("/save-config")
    public RoleMenuModel saveRoleMenu(@RequestBody RoleMenuModel roleMenuModel)
    {
        return roleMenuRepository.save(roleMenuModel);
    }


}
