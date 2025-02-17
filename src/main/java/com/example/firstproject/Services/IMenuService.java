package com.example.firstproject.Services;
import com.example.firstproject.Entities.Menu;

import java.util.List;

public interface IMenuService{
    List<Menu> retrieveAllMenu();
    Menu addMenu(Menu c);
    Menu updateMenu(Menu c);
    Menu retrieveMenu(Long idChaine);
    void removeMenu(Long idChaine);
    List<Menu> addMenu(List<Menu> menus);
}
