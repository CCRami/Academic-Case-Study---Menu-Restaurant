package com.example.firstproject.Services;

import com.example.firstproject.Entities.Menu;
import com.example.firstproject.Repositories.MenuRepository;

import java.util.List;

public class MenuService implements IMenuService{
    MenuRepository menuRepository;
    @Override
    public List<Menu> retrieveAllMenu() {
        return (List<Menu>) menuRepository.findAll();
    }

    @Override
    public Menu addMenu(Menu c) {
        return menuRepository.save(c);
    }

    @Override
    public Menu updateMenu(Menu c) {
        return menuRepository.save(c);
    }

    @Override
    public Menu retrieveMenu(Long idChaine) {
        return menuRepository.findById(idChaine).get();
    }

    @Override
    public void removeMenu(Long idChaine) {
        menuRepository.deleteById(idChaine);
    }

    @Override
    public List<Menu> addMenu(List<Menu> menus) {
        return null;
    }
}
