package org.acme;

public class Test {

    String ID_INSTANCIA;
    String DEPARTAMENTO;
    String TIPO_AJUSTE;
    String MONEDA;
    String FECHA_CREACION;
    String FECHA_PROCESADO;
    String ID_INSTANCIA_RELACIONADA;
    String APROBACION_ADJUNTA;
    String TOTAL_DEBITO;
    String TOTAL_CREDITO;
    String TOTAL_TRANSACCIONES;
    String ESTADO_SOLICITUD;
    String NIVEL_APROBACION;
    String CREADOR;
    String REVISOR;
    String APROBADOR;

    public Test(String ID_INSTANCIA,
            String DEPARTAMENTO,
            String TIPO_AJUSTE,
            String MONEDA,
            String FECHA_CREACION,
            String FECHA_PROCESADO,
            String ID_INSTANCIA_RELACIONADA,
            String APROBACION_ADJUNTA,
            String TOTAL_DEBITO,
            String TOTAL_CREDITO,
            String TOTAL_TRANSACCIONES,
            String ESTADO_SOLICITUD,
            String NIVEL_APROBACION,
            String CREADOR,
            String REVISOR,
            String APROBADOR) {
        this.ID_INSTANCIA = ID_INSTANCIA;
        this.DEPARTAMENTO = DEPARTAMENTO;
        this.TIPO_AJUSTE = TIPO_AJUSTE;
        this.MONEDA = MONEDA;
        this.FECHA_CREACION = FECHA_CREACION;
        this.FECHA_PROCESADO = FECHA_PROCESADO;
        this.ID_INSTANCIA_RELACIONADA = ID_INSTANCIA_RELACIONADA;
        this.APROBACION_ADJUNTA = APROBACION_ADJUNTA;
        this.TOTAL_DEBITO = TOTAL_DEBITO;
        this.TOTAL_CREDITO = TOTAL_CREDITO;
        this.TOTAL_TRANSACCIONES = TOTAL_TRANSACCIONES;
        this.ESTADO_SOLICITUD = ESTADO_SOLICITUD;
        this.NIVEL_APROBACION = NIVEL_APROBACION;
        this.CREADOR = CREADOR;
        this.REVISOR = REVISOR;
        this.APROBADOR = APROBADOR;
    }

    public String getID_INSTANCIA() {
        return ID_INSTANCIA;
    }

    public void setID_INSTANCIA(String iD_INSTANCIA) {
        ID_INSTANCIA = iD_INSTANCIA;
    }

    public String getDEPARTAMENTO() {
        return DEPARTAMENTO;
    }

    public void setDEPARTAMENTO(String dEPARTAMENTO) {
        DEPARTAMENTO = dEPARTAMENTO;
    }

    public String getTIPO_AJUSTE() {
        return TIPO_AJUSTE;
    }

    public void setTIPO_AJUSTE(String tIPO_AJUSTE) {
        TIPO_AJUSTE = tIPO_AJUSTE;
    }

    public String getMONEDA() {
        return MONEDA;
    }

    public void setMONEDA(String mONEDA) {
        MONEDA = mONEDA;
    }

    public String getFECHA_CREACION() {
        return FECHA_CREACION;
    }

    public void setFECHA_CREACION(String fECHA_CREACION) {
        FECHA_CREACION = fECHA_CREACION;
    }

    public String getFECHA_PROCESADO() {
        return FECHA_PROCESADO;
    }

    public void setFECHA_PROCESADO(String fECHA_PROCESADO) {
        FECHA_PROCESADO = fECHA_PROCESADO;
    }

    public String getID_INSTANCIA_RELACIONADA() {
        return ID_INSTANCIA_RELACIONADA;
    }

    public void setID_INSTANCIA_RELACIONADA(String iD_INSTANCIA_RELACIONADA) {
        ID_INSTANCIA_RELACIONADA = iD_INSTANCIA_RELACIONADA;
    }

    public String getAPROBACION_ADJUNTA() {
        return APROBACION_ADJUNTA;
    }

    public void setAPROBACION_ADJUNTA(String aPROBACION_ADJUNTA) {
        APROBACION_ADJUNTA = aPROBACION_ADJUNTA;
    }

    public String getTOTAL_DEBITO() {
        return TOTAL_DEBITO;
    }

    public void setTOTAL_DEBITO(String tOTAL_DEBITO) {
        TOTAL_DEBITO = tOTAL_DEBITO;
    }

    public String getTOTAL_CREDITO() {
        return TOTAL_CREDITO;
    }

    public void setTOTAL_CREDITO(String tOTAL_CREDITO) {
        TOTAL_CREDITO = tOTAL_CREDITO;
    }

    public String getTOTAL_TRANSACCIONES() {
        return TOTAL_TRANSACCIONES;
    }

    public void setTOTAL_TRANSACCIONES(String tOTAL_TRANSACCIONES) {
        TOTAL_TRANSACCIONES = tOTAL_TRANSACCIONES;
    }

    public String getESTADO_SOLICITUD() {
        return ESTADO_SOLICITUD;
    }

    public void setESTADO_SOLICITUD(String eSTADO_SOLICITUD) {
        ESTADO_SOLICITUD = eSTADO_SOLICITUD;
    }

}
