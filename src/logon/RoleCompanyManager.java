/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logon;

import java.util.UUID;

/**
 *
 * @author Evgeniy
 */
class RoleCompanyManager extends RoleUser{

    public RoleCompanyManager(String name, String login, String pass) {
        super(name, login, pass);
    }
    
    @Override
    public UUID getStatusID() {
        return RoleStatus.manager;
    }
}
