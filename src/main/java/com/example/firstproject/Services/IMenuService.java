package com.example.firstproject.Services;
import com.example.firstproject.Entities.Menu;

import java.util.List;

public interface IMenuService{
    List<Menu> retrieveAllMenus();
    Menu addMenu(Menu c);
    Menu updateMenu(Menu c);
    Menu retrieveMenu(Long idChaine);
    void removeMenu(Long idChaine);
    List<Menu> addMenus(List<Menu> menus);
}
