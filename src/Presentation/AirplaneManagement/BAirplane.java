/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Presentation.AirplaneManagement;

import Model.AplicationObject.IAirplane;

public class BAirplane {
    static public IAirplane build()
    {
        return new Airplane();
    }
}
