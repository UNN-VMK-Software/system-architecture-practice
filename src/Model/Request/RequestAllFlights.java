/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Request;

import Model.DataAccess.IRequest;
import Model.Logon.IRole;

public class RequestAllFlights  extends RequestSimple implements IRequest{

    public RequestAllFlights(IRole r) {
        super(r);
    }

}
