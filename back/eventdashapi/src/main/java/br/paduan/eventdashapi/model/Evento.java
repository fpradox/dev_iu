package br.paduan.eventdashapi.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "itmn_evento")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_seq")
    private int id;

    @Column(name = "data_evt")
    private LocalDate dataevt;

    @OneToOne
     
    @JoinColumn(name = "id_alarme") // JoinColumm = nome da coluna na tabela do
    private Alarme alarme;
    
    @OneToOne
    @JoinColumn(name = "id_equip")
    private Equipamento equipamento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataevt() {
        return dataevt;
    }

    public void setDataevt(LocalDate data_evt) {
        this.dataevt = data_evt;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public Alarme getAlarme() {
        return alarme;
    }

    public void setAlarme(Alarme alarme) {
        this.alarme = alarme;
    }

    /*
     * public Alarme getAlarme() { return alarme; }
     * 
     * public void setAlarme(Alarme alarme) { this.alarme = alarme; }
     * 
     * public Equipamento getEquipamento() { return equipamento; }
     * 
     * public void setEquipamento(Equipamento equipamento) { this.equipamento =
     * equipamento; }
     * 
     * public Equipamento getIpaddr() { return ipaddr; }
     * 
     * public void setEquipamento(Equipamento ipaddr) { this.ipaddr = ipaddr; }
     * 
     */

}