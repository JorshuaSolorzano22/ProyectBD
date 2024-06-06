CREATE PROCEDURE [CargarTablas]
AS
BEGIN
    SELECT 
        [Vendedor], 
        [Cuatrimestre1],
        [Cuatrimestre2],
        [Cuatrimestre3],
        [Total_Vendedor]
    FROM [dbo].[ventasVendedor]
   
CREATE PROCEDURE [CargarVentas]
AS
BEGIN
    SELECT
        [Fecha],
        [Id_Cliente],
        [Vendedor],
        [Forma_de_pago],
        [Producto],
        [Categoría], 
        [Precio], 
        [Cantidad],
        [Ventas]
    FROM [dbo].[Ventas];
END
GO

CREATE PROCEDURE [CargarVentasV]
AS
BEGIN
    SELECT 
        [Vendedor], 
        [Cuatrimestre1],
        [Cuatrimestre2],
        [Cuatrimestre3],
        [Total_Vendedor]
    FROM [dbo].[ventasVendedor]
	END
GO