package net.joastbg.sampleapp;


import junit.framework.Assert;
import net.joastbg.sampleapp.dao.ClientDao;
import net.joastbg.sampleapp.dao.CompteDao;
import net.joastbg.sampleapp.entities.Client;
import net.joastbg.sampleapp.entities.CompteBancaire;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@TransactionConfiguration(transactionManager="transactionManager", defaultRollback=false)
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/config/BeanLocations.xml")
public class CompteDaoTest {


    @Autowired
    CompteDao compteDao;
    ClientDao clientDao;

    CompteBancaire compte;
    Client client;

    @Before
    public void setUp() {
        client = new Client();
        client.setNom("Cathy Catou");
        
        
        compte = new CompteBancaire();
        compte.setSwift_code("JMB");
        compte.setIban("FR7612548029980000000150086");
        compte.setProprietaire("Cathy Catou");
        compte.setId_client(1);
    }

    @Test
    public void testPersist(){
        clientDao.persist(client);
        String id = compteDao.persist(compte);
        Assert.assertTrue(id != null);
        compteDao.delete(compte);
    }

    @Test
    public void testFind(){
        String id = compteDao.persist(compte);
        CompteBancaire compteFound = compteDao.find(id);
        Assert.assertNotNull(compteFound);
        Assert.assertEquals(compte,compteFound);
        compteDao.delete(compte);
    }

}
